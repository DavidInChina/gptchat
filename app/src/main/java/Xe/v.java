package Xe;

import jh.EnumC4051n2;
import jh.EnumC4056o2;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v {

    /* renamed from: a  reason: collision with root package name */
    public static final P5.c f21937a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final P5.c f21938b = new Object();

    public static final EnumC4051n2 a(int i10) {
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2) {
                    if (f6 == 3) {
                        return EnumC4051n2.UNKNOWN;
                    }
                    throw new RuntimeException();
                }
                return EnumC4051n2.SCREEN_SHARE;
            }
            return EnumC4051n2.MICROPHONE;
        }
        return EnumC4051n2.CAMERA;
    }

    public static final EnumC4056o2 b(int i10) {
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 == 2) {
                    return EnumC4056o2.UNRECOGNIZED;
                }
                throw new RuntimeException();
            }
            return EnumC4056o2.VIDEO;
        }
        return EnumC4056o2.AUDIO;
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "UNRECOGNIZED";
                }
                throw null;
            }
            return "VIDEO";
        }
        return "AUDIO";
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "UNKNOWN";
                }
                return "SCREEN_SHARE";
            }
            return "MICROPHONE";
        }
        return "CAMERA";
    }
}
