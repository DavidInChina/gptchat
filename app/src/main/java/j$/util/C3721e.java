package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3721e extends RuntimeException {
    public static void a(Serializable serializable, String str) {
        throw new RuntimeException("Unsupported " + str + " :" + serializable);
    }
}
