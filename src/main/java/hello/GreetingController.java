package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/GetExpense")
    public ExpenseModelView GetExpense(@RequestParam(value = "id",defaultValue = "0") String id){
        ExpenseModelView expenseModelView = new ExpenseModelView();
        ExpenseTenderModeDetails expenseTenderModeDetails = new ExpenseTenderModeDetails();
        //ExpenseCategory expenseCategory = new ExpenseCategory();
        VendorModelView vendorModelView = new VendorModelView();
        expenseModelView.setVendorModelView(vendorModelView);
        expenseModelView.setExpenseCategory("blah");
        expenseModelView.setExpenseTenderModeDetails(expenseTenderModeDetails);
        return expenseModelView;
    }
}
