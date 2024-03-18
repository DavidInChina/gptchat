package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes.dex */
public final class DebugImage implements AbstractC3656j0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.AbstractC3656j0
    public void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.uuid != null) {
            c3636c1.n("uuid");
            c3636c1.t(this.uuid);
        }
        if (this.type != null) {
            c3636c1.n("type");
            c3636c1.t(this.type);
        }
        if (this.debugId != null) {
            c3636c1.n("debug_id");
            c3636c1.t(this.debugId);
        }
        if (this.debugFile != null) {
            c3636c1.n("debug_file");
            c3636c1.t(this.debugFile);
        }
        if (this.codeId != null) {
            c3636c1.n("code_id");
            c3636c1.t(this.codeId);
        }
        if (this.codeFile != null) {
            c3636c1.n("code_file");
            c3636c1.t(this.codeFile);
        }
        if (this.imageAddr != null) {
            c3636c1.n("image_addr");
            c3636c1.t(this.imageAddr);
        }
        if (this.imageSize != null) {
            c3636c1.n("image_size");
            c3636c1.s(this.imageSize);
        }
        if (this.arch != null) {
            c3636c1.n("arch");
            c3636c1.t(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.unknown, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l10) {
        this.imageSize = l10;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j6) {
        this.imageSize = Long.valueOf(j6);
    }
}
