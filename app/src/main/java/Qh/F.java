package Qh;

import wh.AbstractC6250o;

/* loaded from: classes.dex */
public enum F {
    METHOD("isMethod()"),
    CONSTRUCTOR("isConstructor()"),
    TYPE_INITIALIZER("isTypeInitializer()"),
    VIRTUAL("isVirtual()"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_METHOD("isDefaultMethod()");
    

    /* renamed from: Y  reason: collision with root package name */
    public final String f14963Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G f14964Z = new G(this);

    F(String str) {
        this.f14963Y = str;
    }

    public abstract boolean a(AbstractC6250o abstractC6250o);
}
