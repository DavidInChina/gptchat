package i0;

import java.util.LinkedHashMap;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final k f32424Z = new k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final k f32425h0 = new k(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32426Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(0);
        this.f32426Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f32426Y) {
            case 0:
                return new j(new LinkedHashMap());
            default:
                return null;
        }
    }
}
