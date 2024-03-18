package i0;

import java.util.Map;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final g f32412Z = new g(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final g f32413h0 = new g(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32414Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f32414Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f32414Y) {
            case 0:
                return new j((Map) obj);
            default:
                return obj;
        }
    }
}
