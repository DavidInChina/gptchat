package i2;

import X1.m;
import jf.y;
import kotlin.jvm.internal.o;
import wf.n;

/* renamed from: i2.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3462d extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3462d f32598Z = new C3462d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3462d f32599h0 = new C3462d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3462d f32600i0 = new C3462d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3462d f32601j0 = new C3462d(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32602Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3462d(int i10) {
        super(2);
        this.f32602Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f32602Y) {
            case 0:
                ((C3459a) obj).f32593b = (String) obj2;
                return yVar;
            case 1:
                ((C3459a) obj).f32592a = (m) obj2;
                return yVar;
            case 2:
                ((C3459a) obj).f32594c = (C3464f) obj2;
                return yVar;
            default:
                ((C3459a) obj).f32595d = ((Number) obj2).intValue();
                return yVar;
        }
    }
}
