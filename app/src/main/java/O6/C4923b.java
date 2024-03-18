package o6;

import id.AbstractC3557B;
import java.lang.ref.WeakReference;

/* renamed from: o6.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4923b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4923b f40806Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        WeakReference weakReference = (WeakReference) obj;
        AbstractC3557B.c0("it", weakReference);
        if (weakReference.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
