public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        Number[] arrreturn = new Number[numArr.length];
        int count = 0;
        for (int i = 0; i < numArr.length;i++)
        {
            if (numArr[i] != null)
            {
                Number x = numArr[i];
                for (int j = i + 1 ; j < numArr.length;j++)
                {
                    if (numArr[j] != null)
                    {
                        if (numArr[j].getClass().equal(numArr[i].getClass()))
                        {
                            if (numArr[j] instanceof Byte)
                            {
                                x = (Byte)x + (Byte) numArr[j]; 
                            }
                            if (numArr[j] instanceof Integer)
                            {
                                x = (Integer)x + (Integer) numArr[j]; 
                            }
                            if (numArr[j] instanceof Double)
                            {
                                x = (Double)x + (Double) numArr[j]; 
                            }
                            if (numArr[j] instanceof Float)
                            {
                                x = (Float)x + (Float) numArr[j]; 
                            }
                            if (numArr[j] instanceof Short)
                            {
                                x = (Short)x + (Short) numArr[j]; 
                            }
                            if (numArr[j] instanceof Long)
                            {
                                x = (Long)x + (Long) numArr[j]; 
                            }
                            numArr[j] = null;
                        }
                    } 
                }
                arrreturn[count] = x;
                count++;
            }
        }
        for (int a = count; a < numArr.length;a++)
        {
            arrreturn[a] = null;
        }
        return arrreturn;
    }
}