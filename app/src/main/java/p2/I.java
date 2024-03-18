package p2;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f41813a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static String f41814b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (I.class) {
            if (f41813a.add(str)) {
                f41814b += ", " + str;
            }
        }
    }
}
