package com.server.mcpServer;


import org.slf4j.Logger;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class McpTools {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(McpTools.class);

    @McpTool(name = "latestTextUpdate",  description = "Get the latest text update from the server.")
    public String getLatestTextUpdate()
    {
        return "Welcome to MCP Server!";
    }

}
