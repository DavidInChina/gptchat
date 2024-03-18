package Sg;

import id.AbstractC3557B;
import java.lang.ref.SoftReference;

/* renamed from: Sg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1391c extends ClassValue {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16648a;

    /* JADX WARN: Type inference failed for: r3v2, types: [dh.Y, java.lang.Object] */
    public final Object computeValue(Class cls) {
        switch (this.f16648a) {
            case 0:
                AbstractC3557B.a0("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>", cls);
                return k.a(cls);
            default:
                AbstractC3557B.c0("type", cls);
                ?? obj = new Object();
                obj.f28432a = new SoftReference(null);
                return obj;
        }
    }
}
