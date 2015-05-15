public class ArrayCopier {
    
    public int[] copy(int[] src, int[] dst) {
        int loopStopper = 0;
        if (src.length < dst.length)
        {
            loopStopper = src.length;
        }
        else
        {
            loopStopper = dst.length;
        }

        for (int count = 0; count < loopStopper; count++) {
            dst[count] = src[count];
        }
        return dst;
    }
}
