package Og;

import Ng.x0;
import Sg.t;
import android.os.Looper;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements t {
    @Override // Sg.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // Sg.t
    public x0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // Sg.t
    public int c() {
        return 1073741823;
    }
}
