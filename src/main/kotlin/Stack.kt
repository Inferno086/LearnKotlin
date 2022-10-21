class Stack
{
    private val _MAX : Int = 6
    private var top : Int
    private var size : Int
    private var arr : IntArray

    init
    {
        top = -1
        size = 0
        arr = IntArray(_MAX)
    }

    public fun push(x : Int) : Unit
    {
        if(!isFull())
        {
            top++
            size++
            arr[top] = x
        }
        else
            println("Stack is full!")
    }

    public fun pop() : Int
    {
        var temp : Int = 0
        if(!isEmpty())
        {
            temp = arr[top]
            arr[top] = 0
            top--
            size--
        }
        else
        {
            println("The stack is empty!")
        }
        return temp
    }

    public fun peek(x : Int)
    {
        if(x < 0 || x > top)
        {
            println("Please enter a valid index!")
        }
        else
        {
            val k = arr[x]
            println("The element is : $k")
        }
    }

    public fun isEmpty() : Boolean
    {
        return top == -1
    }

    public fun isFull() : Boolean
    {
        return top == (_MAX - 1)
    }

    public fun display()
    {
        println("The size of the array is $size")
        print("The Stack Contains : ")
        var k = 0
        while(k < size)
        {
            var l = arr[k]
            print("$l ")
            k++
        }
        println()
    }
}

fun main()
{
    val s = Stack()
    s.push(5)
    s.push(2)
    s.push(7)
    s.push(6)
    s.push(8)
    s.push(3)
    s.push(4)
    s.display()
    s.pop()  // 3
    s.display()
    s.pop()  // 8
    s.display()
    s.pop()  // 6
    s.display()
    s.pop()  // 7
    s.display()
    s.pop()  // 2
    s.display()
    s.pop()  // 5
    s.display()
    s.pop()  // Says stack is empty
    s.display()
    s.pop()  // Says stack is empty
    s.display()
    s.push(6)
    s.display()
    s.push(3)
    s.display()
    s.push(4)
    s.display()
    s.peek(0)
    s.peek(2)
    s.peek(-1)
    s.peek(3)
}