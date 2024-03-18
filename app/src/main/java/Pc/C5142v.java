package pc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: pc.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5142v extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5144x f43035Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f43036Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5144x f43037h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f43038i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5142v(C5144x c5144x, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43037h0 = c5144x;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43036Z = obj;
        this.f43038i0 |= Integer.MIN_VALUE;
        return this.f43037h0.b(this);
    }
}
