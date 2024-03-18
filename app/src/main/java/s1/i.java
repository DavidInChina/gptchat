package S1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class i extends Q1.j {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f16080a;

    public i(EditText editText) {
        this.f16080a = new WeakReference(editText);
    }

    @Override // Q1.j
    public final void b() {
        j.a((EditText) this.f16080a.get(), 1);
    }
}
