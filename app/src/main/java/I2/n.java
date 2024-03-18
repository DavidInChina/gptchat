package I2;

import Q1.ThreadFactoryC1173a;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final i f8006d = new i(2, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final i f8007e = new i(3, -9223372036854775807L);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f8008a;

    /* renamed from: b  reason: collision with root package name */
    public j f8009b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f8010c;

    public n(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = AbstractC5530A.f45131a;
        this.f8008a = Executors.newSingleThreadExecutor(new ThreadFactoryC1173a(concat, 1));
    }

    public final boolean a() {
        if (this.f8009b != null) {
            return true;
        }
        return false;
    }
}
