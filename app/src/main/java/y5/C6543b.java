package y5;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import p5.AbstractC5091c;
import wf.k;

/* renamed from: y5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6543b extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6543b f50765Z = new C6543b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6543b f50766h0 = new C6543b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50767Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6543b(int i10) {
        super(1);
        this.f50767Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f50767Y) {
            case 0:
                AbstractC5091c abstractC5091c = (AbstractC5091c) obj;
                AbstractC3557B.c0("it", abstractC5091c);
                return new N5.b(Runtime.getRuntime().availableProcessors(), d.f50775H, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), abstractC5091c);
            default:
                return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        }
    }
}
