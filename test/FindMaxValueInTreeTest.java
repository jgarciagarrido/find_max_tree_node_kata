import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindMaxValueInTreeTest {
    
    @Test
    public void findMaxInNullTree(){
        TreeNode root = null;
        try {
            FindMaxValueInTree.findMax(root);
            fail("Should return an Exception");
        } catch (NullPointerException e) {
            
        }
    }
    
}
