package Pe;

import android.media.AudioAttributes;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f13951a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final AudioAttributes f13952b;

    public b() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
        AbstractC3557B.b0("Builder()\n            .s\u2026ECH)\n            .build()", build);
        this.f13952b = build;
    }
}
