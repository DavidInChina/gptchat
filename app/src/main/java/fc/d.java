package Fc;

import java.io.Closeable;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Closeable f5192Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f5193Z;

    /* renamed from: h0  reason: collision with root package name */
    public h f5194h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f5195i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ g f5196j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f5197k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5196j0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5195i0 = obj;
        this.f5197k0 |= Integer.MIN_VALUE;
        return this.f5196j0.h(this);
    }
}
