package Z1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Z1.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1755c0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1771m f22946Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22947Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1757d0 f22948h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f22949i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755c0(C1757d0 c1757d0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22948h0 = c1757d0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22947Z = obj;
        this.f22949i0 |= Integer.MIN_VALUE;
        return C1757d0.a(this.f22948h0, null, this);
    }
}
