package A0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f352Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f353Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f354h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f353Z = dVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f352Y = obj;
        this.f354h0 |= Integer.MIN_VALUE;
        return this.f353Z.a(0L, 0L, this);
    }
}
