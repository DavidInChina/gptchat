package ab;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ab.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1944B extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1945C f24056Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f24057Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1945C f24058h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f24059i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1944B(C1945C c1945c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f24058h0 = c1945c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f24057Z = obj;
        this.f24059i0 |= Integer.MIN_VALUE;
        return this.f24058h0.o(this);
    }
}
