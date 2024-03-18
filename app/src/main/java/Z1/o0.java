package Z1;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23045Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f23046Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f23047h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, Context context, String str) {
        super(0);
        this.f23045Y = i10;
        this.f23046Z = context;
        this.f23047h0 = str;
    }

    public final File a() {
        int i10 = this.f23045Y;
        String str = this.f23047h0;
        Context context = this.f23046Z;
        switch (i10) {
            case 0:
                return R4.b.n0(context, str);
            case 1:
            default:
                return new File(context.getCacheDir(), String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str}, 1)));
            case 2:
                return AbstractC5260f.I(context, str);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f23045Y) {
            case 0:
                return a();
            case 1:
            default:
                return a();
            case 2:
                return a();
        }
    }
}
