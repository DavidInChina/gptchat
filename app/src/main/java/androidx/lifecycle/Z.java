package androidx.lifecycle;

import id.AbstractC3557B;
import l2.AbstractC4331b;
import l2.C4333d;

/* loaded from: classes2.dex */
public class Z implements AbstractC4331b, b0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final Z f25347Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final Z f25348Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public static Z f25349h0;

    @Override // androidx.lifecycle.b0
    public Y b(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            AbstractC3557B.b0("{\n                modelC\u2026wInstance()\n            }", newInstance);
            return (Y) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    @Override // androidx.lifecycle.b0
    public Y d(Class cls, C4333d c4333d) {
        return b(cls);
    }
}
