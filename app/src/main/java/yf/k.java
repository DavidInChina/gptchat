package Yf;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import kg.C4294f;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22359Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, Object obj) {
        super(1, obj);
        this.f22359Y = i10;
    }

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        switch (this.f22359Y) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        switch (this.f22359Y) {
            case 0:
                return kotlin.jvm.internal.C.f37623a.b(o.class);
            default:
                return kotlin.jvm.internal.C.f37623a.b(o.class);
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        switch (this.f22359Y) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f22359Y;
        switch (i10) {
            case 0:
                C4294f c4294f = (C4294f) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("p0", c4294f);
                        return o.v((o) this.receiver, c4294f);
                    default:
                        AbstractC3557B.c0("p0", c4294f);
                        return o.w((o) this.receiver, c4294f);
                }
            default:
                C4294f c4294f2 = (C4294f) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("p0", c4294f2);
                        return o.v((o) this.receiver, c4294f2);
                    default:
                        AbstractC3557B.c0("p0", c4294f2);
                        return o.w((o) this.receiver, c4294f2);
                }
        }
    }
}
