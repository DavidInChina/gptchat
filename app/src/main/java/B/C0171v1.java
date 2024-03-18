package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.v1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0171v1 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.A f1538Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1539Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A1 f1540h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1541i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171v1(A1 a12, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1540h0 = a12;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1539Z = obj;
        this.f1541i0 |= Integer.MIN_VALUE;
        return this.f1540h0.b(0L, this);
    }
}
