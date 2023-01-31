package clients.cashier;


import java.awt.event.ActionListener;
/**
 * The Cashier Controller
 * @author M A Smith (c) June 2014
 */

public class CashierController
{
  private CashierModel model = null;
  private CashierView  view  = null;

  public boolean buyPressed = false;
  public boolean removePressed = false;

  /**
   * Constructor
   * @param model The model 
   * @param view  The view from which the interaction came
   */
  public CashierController( CashierModel model, CashierView view )
  {
    this.view  = view;
    this.model = model;
  }

  /**
   * Check interaction from view
   * @param pn The product number to be checked
   */
  public void doCheck( String pn )
  {
    model.doCheck(pn);
  }

   /**
   * Buy interaction from view
   */
  public void doBuy()
  {
    buyPressed = true;
    model.doBuy();
    buyPressed = false;
  }

  /**
   * remove interaction from view
   */

  public void doRemove()
  {
    removePressed = true;
    model.doRemove();
    removePressed = false;
  }

  /**
   * Bought interaction from view
   */
  public void doBought()
  {
    model.doBought();
  }
}
