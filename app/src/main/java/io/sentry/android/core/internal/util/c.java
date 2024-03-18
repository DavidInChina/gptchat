package io.sentry.android.core.internal.util;

import com.google.android.gms.internal.play_billing.N;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f34157b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f34158a = new ArrayList();

    public final synchronized ArrayList a() {
        if (!this.f34158a.isEmpty()) {
            return this.f34158a;
        }
        File[] listFiles = new File("/sys/devices/system/cpu").listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String p02 = N.p0(file2);
                        if (p02 != null) {
                            this.f34158a.add(Integer.valueOf((int) (Long.parseLong(p02.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f34158a;
    }
}
