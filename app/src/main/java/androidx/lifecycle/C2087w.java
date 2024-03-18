package androidx.lifecycle;

import id.AbstractC3557B;

/* renamed from: androidx.lifecycle.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2087w {

    /* renamed from: a  reason: collision with root package name */
    public EnumC2082q f25382a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC2084t f25383b;

    public final void a(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        EnumC2082q a5 = enumC2081p.a();
        EnumC2082q enumC2082q = this.f25382a;
        AbstractC3557B.c0("state1", enumC2082q);
        if (a5.compareTo(enumC2082q) < 0) {
            enumC2082q = a5;
        }
        this.f25382a = enumC2082q;
        this.f25383b.b(abstractC2086v, enumC2081p);
        this.f25382a = a5;
    }
}
