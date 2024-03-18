package oc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public k f41262Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41263Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f41264h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f41265i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41264h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41263Z = obj;
        this.f41265i0 |= Integer.MIN_VALUE;
        return k.o(this.f41264h0, null, false, null, this);
    }
}
