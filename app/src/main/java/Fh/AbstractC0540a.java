package Fh;

import java.lang.annotation.RetentionPolicy;

/* renamed from: Fh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0540a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5382a;

    static {
        int[] iArr = new int[RetentionPolicy.values().length];
        f5382a = iArr;
        try {
            iArr[RetentionPolicy.RUNTIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5382a[RetentionPolicy.CLASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5382a[RetentionPolicy.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
