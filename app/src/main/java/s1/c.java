package S1;

import Q1.C;
import android.text.Editable;

/* loaded from: classes2.dex */
public final class c extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16067a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile c f16068b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f16069c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f16069c;
        if (cls != null) {
            return new C(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
