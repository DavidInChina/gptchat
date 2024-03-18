package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class O implements AbstractC2465o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final O f26874a = new Object();

    @Override // com.google.android.gms.internal.play_billing.AbstractC2465o0
    public final AbstractC2463n0 a(Class cls) {
        if (Q.class.isAssignableFrom(cls)) {
            try {
                return (AbstractC2463n0) Q.e(cls.asSubclass(Q.class)).m(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2465o0
    public final boolean b(Class cls) {
        return Q.class.isAssignableFrom(cls);
    }
}
