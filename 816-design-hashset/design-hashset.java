class MyHashSet {

    ListNode head;

    public MyHashSet() {
        head = null;
    }

    public void add(int key) {

        ListNode p = head;

        while(p != null) {
            if(p.val == key) return;
            p = p.next;
        }

        ListNode new_node = new ListNode(key);

        if(head == null) {
            head = new_node;
        }
        else {
            p = head;

            while(p.next != null) {
                p = p.next;
            }

            p.next = new_node;
        }
    }

    public void remove(int key) {

        if(head == null) return;

        if(head.val == key) {
            head = head.next;
            return;
        }

        ListNode p = head;

        while(p.next != null) {
            if(p.next.val == key) {
                p.next = p.next.next;
                return;
            }
            p = p.next;
        }
    }

    public boolean contains(int key) {

        ListNode p = head;

        while(p != null) {
            if(p.val == key) return true;
            p = p.next;
        }

        return false;
    }
}