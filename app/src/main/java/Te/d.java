package Te;

import We.C;
import Xe.C1688j;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17187b;

    /* renamed from: c  reason: collision with root package name */
    public final We.w f17188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(We.i iVar, C1688j c1688j, int i10) {
        super(iVar);
        this.f17187b = i10;
        if (i10 != 1) {
            AbstractC3557B.c0("participant", iVar);
            AbstractC3557B.c0("publication", c1688j);
            this.f17188c = iVar;
            return;
        }
        AbstractC3557B.c0("participant", iVar);
        AbstractC3557B.c0("publication", c1688j);
        super(iVar);
        this.f17188c = iVar;
    }

    @Override // Te.m
    public final We.w X() {
        We.w wVar = this.f17188c;
        int i10 = this.f17187b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return (We.i) wVar;
                    default:
                        return (We.i) wVar;
                }
            case 1:
                switch (i10) {
                    case 0:
                        return (We.i) wVar;
                    default:
                        return (We.i) wVar;
                }
            default:
                return (C) wVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C c10, Xe.r rVar) {
        super(c10);
        this.f17187b = 2;
        AbstractC3557B.c0("participant", c10);
        this.f17188c = c10;
    }
}
