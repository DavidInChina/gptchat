package xa;

import ca.C2311c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public f f49708Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f49709Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f49710h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f49711i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ f f49712j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f49713k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49712j0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49711i0 = obj;
        this.f49713k0 |= Integer.MIN_VALUE;
        return this.f49712j0.e(null, null, this);
    }
}
