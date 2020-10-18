package com.sparta.svilen.SortingAlgorithms;

import com.sparta.svilen.Exceptions.ChildNotFoundException;
import com.sparta.svilen.InputCollector;
import com.sparta.svilen.Interfaces.BinaryTree;
import com.sparta.svilen.Interfaces.Sorter;
import com.sparta.svilen.Printer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * BinaryTreeImpl.java - an implementation of the binary tree, used to manage nodes and sort lists of elements.
 * @author  Svilen Petrov
 * @version 1.0
 * @see Node
 */

public class BinaryTreeImpl implements BinaryTree, Sorter {
    private final Node rootNode;
    private final ArrayList<Node> nodes = new ArrayList<>();
    private int numberOfElements = 1;
    private ArrayList<Integer> sortedArrayList;

    public BinaryTreeImpl() {
        this.rootNode = new Node(InputCollector.getBinaryTreeRootNodeInput());
        nodes.add(rootNode);
    }

    public BinaryTreeImpl(int rootNodeElement) {
        this.rootNode = new Node(rootNodeElement);
        nodes.add(rootNode);
    }

    @Override
    public void start(int[] arrayOfNumbers) {
        addElements(arrayOfNumbers);
        Printer.print(Arrays.toString(getSortedTreeAsc()));
    }

    @Override
    public int getRootElement() {
        return this.rootNode.getElement();
    }

    @Override
    public int getNumberOfElements() {
        return this.numberOfElements;
    }

    @Override
    public void addElement(int element) {
        addNote(element, rootNode);
    }

    private void addNote(int element, Node node){
        if (node.getElement() > element) {
            if(node.left != null){
                addNote(element, node.left);
            } else{
                nodes.add(nodes.indexOf((node)), new Node(element));
                numberOfElements++;
                node.left = nodes.get(nodes.indexOf(node)-1);
            }
        } else if (node.getElement() < element) {
            if (node.right != null) {
                addNote(element, node.right);
            }
            else{
                nodes.add(nodes.indexOf((node)), new Node(element));
                numberOfElements++;
                node.right = nodes.get(nodes.indexOf(node)-1);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addNote(element, rootNode);
        }
    }

    @Override
    public boolean findElement(int value) {
        for (Node node : nodes) {
            if (node.getElement() == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        for (Node node : nodes) {
            if(node.getElement() == element) {
                if (nodes.get(nodes.indexOf(node)).left != null) {
                    return nodes.get(nodes.indexOf(node)).left.getElement();
                }
            }
        }
        throw new ChildNotFoundException("No such child.");
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        for (Node node : nodes) {
            if(node.getElement() == element) {
                if (nodes.get(nodes.indexOf(node)).right != null) {
                    return nodes.get(nodes.indexOf(node)).right.getElement();
                }
            }
        }
        throw new ChildNotFoundException("No such child.");
    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedArrayList = new ArrayList<>();
        getSortedListAsc(rootNode);
        return sortedArrayList.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public int[] getSortedTreeDesc() {
        sortedArrayList = new ArrayList<>();
        getSortedListDesc(rootNode);
        return sortedArrayList.stream().mapToInt(i -> i).toArray();
    }

    private void getSortedListAsc(Node node) {
        if (node.left != null){
            getSortedListAsc(node.left);
        }
        sortedArrayList.add(node.getElement());
        if (node.right != null) {
            getSortedListAsc(node.right);
        }
    }

    private void getSortedListDesc(Node node) {
        if (node.right != null) {
            getSortedListDesc(node.right);
        }
        sortedArrayList.add(node.getElement());
        if (node.left != null){
            getSortedListDesc(node.left);
        }
    }

    //Extra method to display child nodes (with handled exceptions)
    public void displayAllChildNodes(BinaryTreeImpl binaryTree, int[] nodeElements) {
        for (int i = 0; i < binaryTree.getNumberOfElements()-1; i++) {
            try{
                Printer.printLeftChild(binaryTree, nodeElements[i]);
            } catch (Exception ignored) {
            }
            try{
                Printer.printRightChild(binaryTree, nodeElements[i]);
            } catch (Exception ignored) {
            }
        }
    }

    private static class Node {
        private final int element;
        Node left;
        Node right;

        public Node(int element) {
            this.element = element;
                this.left = null;
                this.right = null;
        }

        public int getElement() {
            return element;
        }
    }
}
