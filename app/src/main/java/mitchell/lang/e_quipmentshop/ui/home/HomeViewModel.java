package mitchell.lang.e_quipmentshop.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> titleText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        titleText = new MutableLiveData<>();
        titleText.setValue("Hockey");
    //test
    }

    public LiveData<String> getText() {
        return mText;
    }
}