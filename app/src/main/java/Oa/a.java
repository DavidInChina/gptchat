package Oa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f13653Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ e f13654Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f13655h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f13654Z = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f13653Y = obj;
        this.f13655h0 |= Integer.MIN_VALUE;
        return this.f13654Z.a(null, null, this, false);
    }
}
