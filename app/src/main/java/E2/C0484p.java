package E2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: E2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484p {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicLong f4392b = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final Map f4393a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0484p(long j6, v2.l lVar, long j10) {
        this(Collections.emptyMap());
        Uri uri = lVar.f47095a;
    }

    public C0484p(Map map) {
        this.f4393a = map;
    }
}
