package Qg;

import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1208k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14865Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14866Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1209l f14867h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC1207j f14868i0;

    /* renamed from: j0  reason: collision with root package name */
    public Iterator f14869j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208k(C1209l c1209l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14867h0 = c1209l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14865Y = obj;
        this.f14866Z |= Integer.MIN_VALUE;
        return this.f14867h0.b(null, this);
    }
}
