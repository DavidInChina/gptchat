package rb;

import ca.C2325q;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5422l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C2325q f44708Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f44709Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f44710h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44711i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f44712j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44713k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f44714l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5422l(C5436z c5436z, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44713k0 = c5436z;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44712j0 = obj;
        this.f44714l0 |= Integer.MIN_VALUE;
        return this.f44713k0.h(null, null, 0, null, this);
    }
}
