package h4;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f31870Y;

    /* renamed from: Z  reason: collision with root package name */
    public Wg.f f31871Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f31872h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ e f31873i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f31874j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31873i0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31872h0 = obj;
        this.f31874j0 |= Integer.MIN_VALUE;
        return this.f31873i0.a(this);
    }
}
