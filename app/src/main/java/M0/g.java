package m0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* loaded from: classes2.dex */
public final class g extends AutofillManager$AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final g f38805a = new AutofillManager$AutofillCallback();

    public final void a(C4543a c4543a) {
        c4543a.f38801c.registerCallback(e.k(this));
    }

    public final void b(C4543a c4543a) {
        c4543a.f38801c.unregisterCallback(e.k(this));
    }

    public final void onAutofillEvent(View view, int i10, int i11) {
        String str;
        super.onAutofillEvent(view, i10, i11);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
