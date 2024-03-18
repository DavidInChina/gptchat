package Rb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;
import wd.w0;
import wd.y0;

/* renamed from: Rb.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1271q f15366a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15367b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Rb.q, java.lang.Object] */
    static {
        ?? obj = new Object();
        f15366a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentId", obj, 3);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        pluginGeneratedSerialDescriptor.k("conversationId", true);
        pluginGeneratedSerialDescriptor.k("sharedConversationId", true);
        f15367b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(wd.M.f48360a), A7.b.U0(C6166A.f48310a), A7.b.U0(w0.f48470a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        y0 y0Var;
        C6168C c6168c;
        wd.O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15367b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            w0 w0Var = w0.f48470a;
                            if (str3 != null) {
                                y0Var = new y0(str3);
                            } else {
                                y0Var = null;
                            }
                            y0 y0Var2 = (y0) c10.v(pluginGeneratedSerialDescriptor, 2, w0Var, y0Var);
                            if (y0Var2 != null) {
                                str3 = y0Var2.f48473a;
                            } else {
                                str3 = null;
                            }
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        C6166A c6166a = C6166A.f48310a;
                        if (str2 != null) {
                            c6168c = new C6168C(str2);
                        } else {
                            c6168c = null;
                        }
                        C6168C c6168c2 = (C6168C) c10.v(pluginGeneratedSerialDescriptor, 1, c6166a, c6168c);
                        if (c6168c2 != null) {
                            str2 = c6168c2.f48321a;
                        } else {
                            str2 = null;
                        }
                        i10 |= 2;
                    }
                } else {
                    wd.M m10 = wd.M.f48360a;
                    if (str != null) {
                        o10 = new wd.O(str);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 0, m10, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1272s(i10, str, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15367b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6168C c6168c;
        wd.O o10;
        C1272s c1272s = (C1272s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1272s);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15367b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1272s.f15368a;
        y0 y0Var = null;
        if (C10 || str != null) {
            wd.M m10 = wd.M.f48360a;
            if (str != null) {
                o10 = new wd.O(str);
            } else {
                o10 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 0, m10, o10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c1272s.f15369b;
        if (C11 || str2 != null) {
            C6166A c6166a = C6166A.f48310a;
            if (str2 != null) {
                c6168c = new C6168C(str2);
            } else {
                c6168c = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, c6166a, c6168c);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c1272s.f15370c;
        if (C12 || str3 != null) {
            w0 w0Var = w0.f48470a;
            if (str3 != null) {
                y0Var = new y0(str3);
            }
            c10.q(pluginGeneratedSerialDescriptor, 2, w0Var, y0Var);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
