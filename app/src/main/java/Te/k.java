package Te;

import We.C;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: b  reason: collision with root package name */
    public final C f17195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C c10, Xe.z zVar, Xe.r rVar, int i10) {
        super(c10);
        if (i10 != 1) {
            AbstractC3557B.c0("participant", c10);
            this.f17195b = c10;
            return;
        }
        AbstractC3557B.c0("participant", c10);
        super(c10);
        this.f17195b = c10;
    }

    @Override // Te.m
    public final We.w X() {
        return this.f17195b;
    }
}
