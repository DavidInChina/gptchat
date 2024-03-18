package xa;

import ca.C2311c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: xa.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6384a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public f f49686Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f49687Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f49688h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f49689i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ f f49690j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f49691k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6384a(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49690j0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49689i0 = obj;
        this.f49691k0 |= Integer.MIN_VALUE;
        return this.f49690j0.a(null, false, this);
    }
}
