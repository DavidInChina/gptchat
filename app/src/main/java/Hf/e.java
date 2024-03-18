package Hf;

import Mf.AbstractC0997f;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import ng.AbstractC4842i;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f7713Z = new e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f7714h0 = new e(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7715Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f7715Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        String str;
        switch (this.f7715Y) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("entry", entry);
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else if (value instanceof Object[]) {
                    str = Arrays.toString((Object[]) value);
                    AbstractC3557B.b0("toString(...)", str);
                } else {
                    str = value.toString();
                }
                return str2 + '=' + str;
            default:
                AbstractC0997f abstractC0997f = (AbstractC0997f) obj;
                AbstractC3557B.c0("$this$makeKotlinParameterTypes", abstractC0997f);
                return Boolean.valueOf(AbstractC4842i.e(abstractC0997f));
        }
    }
}
