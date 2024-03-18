package Q5;

import java.lang.Thread;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f14434a;

    static {
        int[] iArr = new int[Thread.State.values().length];
        try {
            iArr[Thread.State.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Thread.State.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Thread.State.RUNNABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Thread.State.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Thread.State.TIMED_WAITING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Thread.State.WAITING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f14434a = iArr;
    }
}
