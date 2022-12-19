package leetcode;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class postordernarray {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(212);
        list.add(21);


        System.out.println(list);


    }
    static Object protorder(Node root){

     LinkedList<Node> stack = new LinkedList<>();
     LinkedList<Integer> output = new LinkedList<>();

     if (root == null){
         return output;
     }
     stack.add(root);
     while(!stack.isEmpty()){
         Node node = stack.pollLast();

     }
return -1;
    }

}












