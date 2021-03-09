package seedu.duke.command;

import seedu.duke.exception.CommandException;
import seedu.duke.record.RecordList;
import seedu.duke.storage.Storage;
import seedu.duke.ui.Ui;

import static seedu.duke.command.Utils.checkInvalidOptions;
import static seedu.duke.command.Utils.checkOptionConflict;
import static seedu.duke.common.Constant.OPTION_AMOUNT;
import static seedu.duke.common.Constant.OPTION_EXPENSE;
import static seedu.duke.common.Constant.OPTION_LOAN;
import static seedu.duke.common.Constant.OPTION_SAVINGS;

import java.util.ArrayList;

public class AddCommand extends Command {
    protected static final String COMMAND_ADD = "add";

    private ArrayList<String> parsedArguments;

    public AddCommand(ArrayList<String> parsedArguments) throws CommandException {
        checkInvalidOptions(parsedArguments, COMMAND_ADD,
                OPTION_EXPENSE, OPTION_LOAN, OPTION_SAVINGS, OPTION_AMOUNT);
        checkOptionConflict(parsedArguments, COMMAND_ADD, OPTION_EXPENSE, OPTION_LOAN, OPTION_SAVINGS);
    }

    @Override
    public void execute(RecordList records, Ui ui, Storage storage) {
        addItem(records, ui, storage);
    }

    private void addItem(RecordList records, Ui ui, Storage storage) {

    }


}
